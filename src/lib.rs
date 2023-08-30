use bluer::{Result, Session};

pub struct BluetoothController {
    session: Session,
}

impl BluetoothController {
    pub async fn new() -> Result<Self> {
        let session = Session::new().await?;
        Ok(Self { session })
    }

    pub async fn start(&self) -> Result<()> {
        let adapter = self.session.default_adapter().await?;
        adapter.set_powered(true).await?;
        Ok(())
    }

    pub async fn stop(&self) -> Result<()> {
        let adapter = self.session.default_adapter().await?;
        adapter.set_powered(false).await?;
        Ok(())
    }
}
